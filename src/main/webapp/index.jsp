<!doctype html>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<div id="container">
		<form action="http://localhost:8080/NWEAPostApi/webapi/comment/post" method="post" id="entryForm">
			<div>
				<label for="title">Title:</label>
				<input type="text" name="title" placeholder="Enter Title" required>
			</div>
			<div id="body">
				<label for="body">Message:</label>
				<textarea  rows="5" cols="50" name="body" placeholder="Enter your text" required></textarea>
			</div>
			<input type="submit" class="submit" value="Submit">
		</form>
	</div>
	<script src="app.js"></script>
</body>
</html>