/*global define, angular */

'use strict';

require.config({
    'paths': { 'angular-file-upload': webjars.path("angular-file-upload", "angular-file-upload") },
    'shim': {'angular-file-upload': ['angular']} // for some reason this isn't working
});

require(['angular',  './controllers', './directives', './filters', './services', 'angular-route'],
  function(angular, controllers) {
    require(['angular-file-upload'], function() { });

    // Declare app level module which depends on filters, and services
    
    angular.module('myApp', ['myApp.filters', 'myApp.services', 'myApp.directives', 'ngRoute']).
      config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: controllers.MyCtrl1});
        $routeProvider.when('/view2', {templateUrl: 'partials/partial2.html', controller: controllers.MyCtrl2});
        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);
      
    angular.bootstrap(document, ['myApp']);

});
