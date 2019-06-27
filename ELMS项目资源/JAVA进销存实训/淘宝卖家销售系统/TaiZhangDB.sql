---------------------------------------------------------------------------------------------------
-- 过程名称：TaiZhangDB--台账数据库设计--
-- 过程说明：建立相应的数据库和数据表
--			 增删改查的语句
-- 过程作者：O(∩_∩)O
-- 过程创建日期：2012-11-13
-- 过程修改日期：
-- 过程修改内容：
---------------------------------------------------------------------------------------------------

use master
go

if exists(select * from sysdatabases where name = 'TaiZhangDB')
	drop database TaiZhangDB
go

create database TaiZhangDB
on primary
(
	name='TaiZhangDB_data',
	filename='f:\TaiZhangDB_data.mdf',
	size=5mb,
	maxsize=100mb,
	filegrowth=15%
)
log on
(
	name='TaiZhangDB_log',
	filename='f:\TaiZhangDB_log.ndf',
	size=8mb,
	maxsize=100mb,
	filegrowth=10%
)
go

use TaiZhangDB
go

--创建基本信息表--

--No 1	发货信息表
if exists (select * from sysobjects where name = 'Delivery')
	drop table Delivery
go

create table Delivery
(
	DeliveryID		varchar(6)	primary key,	--发货编号
	DeliveryMonth	varchar(5)	not null,		--发货月份
	DeliveryDate	varchar(5)	not null,		--发货时间
	DeliveryAddress	varchar(8)	not null,		--发往地点
	DeliveryZone	varchar(8)	not null,		--分区
	ProductID		varchar(6)	not null,		--货物编号
)
go

--No 2	货物信息表

if exists(select * from sysobjects where name = 'Product')
	drop table Product
go

create table Product
(
	ProductID	varchar(6)		primary key,	--货物编号
	ProductName varchar(10)		not null,		--货物名称
	SpecType	varchar(10)  	not null,		--规格型号
	UnitPrice	decimal(18,1)   not null,		--单价
	Quantity	int				not null,		--数量
	Unit		varchar(4)		not null,		--单位
	TablePrice	decimal(18,1)	not null,		--台价
)
go

--No 3	购货信息表
if exists(select * from sysobjects where name = 'Purchase')
	drop table Purchase
go

create table Purchase
(
	PurchaseID		varchar(8)	primary key,	--购货编号
	PurchaseName	varchar(20),				--购货单位
	Payment			varchar(8)	not null,		--付款方式
	Logistics		varchar(8)	not null,		--发货物流
	PurchaseAddress	varchar(8)	not null,		--发货地点
	FreightByOpp	int,						--对付运费
	FreightByOwn	int,						--我付运费
	Fee				int,						--手续费
	Admin			varchar(6),					--联系人						
	AdminTel		varchar(12),				--联系方式
	ProductID		varchar(6)	not null,		--货物编号
)
go

--No 4	货源信息表
if exists(select * from sysobjects where name = 'Source')
	drop table Source
go

create table Source
(
	SourceID	varchar(8)	primary key,	--货源编号
	SourceName	varchar(20)	not null,		--货源名称
	SourcePrice	decimal(18,1),				--采购单价
	SourceSum	int,						--采购合计
	Profit		decimal(18,1),				--利润
	ProductID	varchar(6)	not null,		--货物编号
)
go

--添加约束
alter table Delivery
	add constraint FK_Delivery_Product
		foreign key (ProductID) references Product(ProductID)
go

alter table Purchase
	add constraint FK_Purchase_Product
		foreign key (ProductID) references Product(ProductID)
go

alter table Source
	add constraint FK_Source_Product
		foreign key (ProductID) references Product(ProductID)
go

