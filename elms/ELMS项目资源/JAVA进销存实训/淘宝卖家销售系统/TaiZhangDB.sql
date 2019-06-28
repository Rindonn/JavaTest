---------------------------------------------------------------------------------------------------
-- �������ƣ�TaiZhangDB--̨�����ݿ����--
-- ����˵����������Ӧ�����ݿ�����ݱ�
--			 ��ɾ�Ĳ�����
-- �������ߣ�O(��_��)O
-- ���̴������ڣ�2012-11-13
-- �����޸����ڣ�
-- �����޸����ݣ�
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

--����������Ϣ��--

--No 1	������Ϣ��
if exists (select * from sysobjects where name = 'Delivery')
	drop table Delivery
go

create table Delivery
(
	DeliveryID		varchar(6)	primary key,	--�������
	DeliveryMonth	varchar(5)	not null,		--�����·�
	DeliveryDate	varchar(5)	not null,		--����ʱ��
	DeliveryAddress	varchar(8)	not null,		--�����ص�
	DeliveryZone	varchar(8)	not null,		--����
	ProductID		varchar(6)	not null,		--������
)
go

--No 2	������Ϣ��

if exists(select * from sysobjects where name = 'Product')
	drop table Product
go

create table Product
(
	ProductID	varchar(6)		primary key,	--������
	ProductName varchar(10)		not null,		--��������
	SpecType	varchar(10)  	not null,		--����ͺ�
	UnitPrice	decimal(18,1)   not null,		--����
	Quantity	int				not null,		--����
	Unit		varchar(4)		not null,		--��λ
	TablePrice	decimal(18,1)	not null,		--̨��
)
go

--No 3	������Ϣ��
if exists(select * from sysobjects where name = 'Purchase')
	drop table Purchase
go

create table Purchase
(
	PurchaseID		varchar(8)	primary key,	--�������
	PurchaseName	varchar(20),				--������λ
	Payment			varchar(8)	not null,		--���ʽ
	Logistics		varchar(8)	not null,		--��������
	PurchaseAddress	varchar(8)	not null,		--�����ص�
	FreightByOpp	int,						--�Ը��˷�
	FreightByOwn	int,						--�Ҹ��˷�
	Fee				int,						--������
	Admin			varchar(6),					--��ϵ��						
	AdminTel		varchar(12),				--��ϵ��ʽ
	ProductID		varchar(6)	not null,		--������
)
go

--No 4	��Դ��Ϣ��
if exists(select * from sysobjects where name = 'Source')
	drop table Source
go

create table Source
(
	SourceID	varchar(8)	primary key,	--��Դ���
	SourceName	varchar(20)	not null,		--��Դ����
	SourcePrice	decimal(18,1),				--�ɹ�����
	SourceSum	int,						--�ɹ��ϼ�
	Profit		decimal(18,1),				--����
	ProductID	varchar(6)	not null,		--������
)
go

--���Լ��
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

