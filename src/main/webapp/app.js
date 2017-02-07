var form = document.getElementById("entryForm");

form.onsubmit = function (e) {
  e.preventDefault();

  var data = {};
  for (var i = 0, j = form.length; i < j; ++i) {
    var input = form[i];
    if (input.name) {
      data[input.name] = input.value;
    }
  }

  var xhr = new XMLHttpRequest();
  xhr.open(form.method, form.action, true);
  xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');

  xhr.send(JSON.stringify(data));

  xhr.onloadend = function () {
	alert("Data send");
	$('#container').load('show.html');
  };
};