<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h2>
		<b>The Hokie 2012 Football Schedule</b>
	</h2>
	<table border=1>
		<tr>
			<td>Rank</td>
			<td>Opponent</td>
			<td>Hokie Score</td>
			<td>Opponent Score</td>
			<td>Win/Loss</td>
			<td>TV</td>
			<td>Location</td>
			<td>Date</td>
		</tr>
		<c:forEach var="game" items="${gameList}">
			<tr>
				<c:choose>
					<c:when test="${game.rank > 0 }">
						<td><c:out value="${game.rank }" /></td>
					</c:when>
					<c:otherwise>
						<td>-</td>
					</c:otherwise>
				</c:choose>
				<td><c:out value="${game.opponent }" /></td>
				<c:choose>
					<c:when test="${game.winLoss == '-' }">
						<td>-</td>
						<td>-</td>
					</c:when>
					<c:otherwise>
						<td><c:out value="${game.hokieScore }" /></td>
						<td><c:out value="${game.oppScore }" /></td>
					</c:otherwise>
				</c:choose>
				<td><c:out value="${game.winLoss }" /></td>
				<td><c:out value="${game.tv }" /></td>
				<td><c:out value="${game.location }" /></td>
				<td><c:out value="${game.date }" /></td>
			</tr>
		</c:forEach>
	</table>
	Next Game: The Russell Athletic Bowl
</body>
</html>