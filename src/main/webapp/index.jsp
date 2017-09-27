<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>#Potrindim</title>
</head>
<body>
<h1>#potrindim</h1>
<input type="text" id="message"/>
<input value="Отправить" onclick="sendMessage();" type="button"/>
<hr/>
<textarea readonly="readonly" id="messages" rows="15" cols="60"></textarea>
<script type="text/javascript" src="js/socket.js">
</script>
</body>
</html>
