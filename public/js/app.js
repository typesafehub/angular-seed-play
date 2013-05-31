/*global define, angular */

'use strict';

// Declare here that angular is the US version - other locales can be easily substituted.

define('angular', ['webjars!angular-locale_en-us.js'], function() {
    return angular;
});

require(['angular', './controllers', './directives', './filters', './services'],
  function(angular, controllers) {

// Declare app level module which depends on filters, and services

angular.module('myApp', ['myApp.filters', 'myApp.services', 'myApp.directives']).
  config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: controllers.MyCtrl1});
    $routeProvider.when('/view2', {templateUrl: 'partials/partial2.html', controller: controllers.MyCtrl2});
    $routeProvider.otherwise({redirectTo: '/view1'});
}]);
  
angular.bootstrap(document, ['myApp']);

});
