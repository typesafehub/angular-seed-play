/*global define, angular */

'use strict';

require(['angular', './controllers', './directives', './filters', './services', 'angular-route'],
  function(angular, controllers) {

    // Declare app level module which depends on filters, and services
    
    angular.module('myApp', ['myApp.filters', 'myApp.services', 'myApp.directives', 'ngRoute']).
      config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/view1', {templateUrl: 'assets/partials/partial1.html', controller: controllers.MyCtrl1});
        $routeProvider.when('/view2', {templateUrl: 'assets/partials/partial2.html', controller: controllers.MyCtrl2});
        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);
      
    angular.bootstrap(document, ['myApp']);

});
