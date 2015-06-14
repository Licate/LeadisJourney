app.controller('editorCtrl', ['$scope', '$http', function ($scope, $http) {
    var editor = ace.edit("editor");
    editor.setTheme("ace/theme/idle_fingers");
    editor.getSession().setMode("ace/mode/c_cpp");

    $scope.comp = function () {
        var code = editor.getSession().getValue();
        console.log(code);
        $http.post("http://localhost:8080/code", {code: code}).success(function(data) {
	    if (data.success)
		toastr.success("Compilation success");
	    else
		toastr.warning("Compilation fail");
	}).error(function() {
	    toastr.error("An error occured");
	});
    };
    $scope.dest = function() {
        editor.getSession().setValue("");
    };
}]);
