'use strict';

define(['webjars/angularjs/1.0.5/angular.js'], 
  function() {

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.
angular.module('myApp.services', []).
  value('version', '0.1');

});