<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
				<c:when test="${pb.tp <= 6 }">
					<c:set var="begin" value="1" />
					<c:set var="end" value="${pb.tp }" />
				</c:when>
				<c:otherwise>
					<c:set var="begin" value="${pb.pc-2 }" />
					<c:set var="end" value="${pb.pc + 3}" />
					<c:if test="${begin < 1 }">
						<c:set var="begin" value="1" />
						<c:set var="end" value="6" />
					</c:if>
					<c:if test="${end > pb.tp }">
						<c:set var="begin" value="${pb.tp-5 }" />
						<c:set var="end" value="${pb.tp }" />
					</c:if>
				</c:otherwise>
			</c:choose>
			<ul class="pagination">
				<c:choose>
					<c:when test="${pb.pc eq 1 }">
						<li class="disabled"><a>上一页</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${pb.url }&pc=${pb.pc-1}">上一页</a></li>
					</c:otherwise>
				</c:choose>
				<c:forEach begin="${begin}" end="${end}" var="i">
					<c:choose>
						<c:when test="${i eq pb.pc }">
							<li class="active"><a href="${pb.url }&pc=${i}">${i}</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="${pb.url }&pc=${i}">${i}</a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:if test="${end < pb.tp }">
					<li><span>...</span></li>
				</c:if>
				<c:choose>
					<c:when test="${pb.pc eq pb.tp}">
						<li class="disabled"><a>下一页</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${pb.url }&pc=${pb.pc+1}">下一页</a></li>
					</c:otherwise>
				</c:choose>
				<li><span>共${pb.tp }页</span></li>
			</ul>