/**
 * Created by Licate on 25/02/2015.
 */
var app = angular.module("leadis", ["ui.router", "ui.bootstrap"]);
app.config(["$stateProvider", "$urlRouterProvider", function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.when("", "/");
    $stateProvider.state("Home", {
        url: "/",
        templateUrl: "app/views/home.html",
        controller: "homeCtrl"
    })
        .state("About", {
        url: "/about",
        templateUrl: "app/views/about.html"
    })
        .state("Editor", {
            url: "/editor",
            templateUrl: "app/views/editor.html",
			controller: "editorCtrl"
        });
}]);