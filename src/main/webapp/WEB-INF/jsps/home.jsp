<%@include file="common/include.jsp"%>



<html>
<body>
	<h2>Welcome home</h2>

	<form:form action="${jmsCompleted_url}" method="POST"
		commandName="user">

		<table>
			<tr>
				<td>Input User Name:</td>
				<td><form:input path="username" name="username" type="text"></form:input></td>
			</tr>

			<tr>
				<td>Input Age:</td>
				<td><form:input path="age" name="age" type="text"></form:input></td>
			</tr>

			<tr>
				<td>Input Comment:</td>
				<td><form:textarea path="comment" name="comment" type="text" /></td>
			</tr>
			<tr>
				<td><input value="JMS Send" type="submit" /></td>
				<td></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
