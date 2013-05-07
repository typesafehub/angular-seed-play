angular-seed-play
=================

This project illustrates how [WebJars](http://www.webjars.org/) can be used along with
[requirejs](http://requirejs.org/) in relation to the popular
[angular-seed](https://github.com/angular/angular-seed) project.

<a href="https://grandcentral.cloudbees.com/?CB_clickstart=https://raw.github.com/typesafehub/angular-seed-play/master/clickstart.json"><img src="https://d3ko533tu1ozfq.cloudfront.net/clickstart/deployInstantly.png"/></a>

The main idea is to show how little impact there is on JavaScript when using it in the context of Play and WebJars.
The project also illustrates the intrinsic support of JavaScript development from within Play. We hope that the sample
serves to show that Play is not strongly opinionated about how JavaScript development is to be done, but that it can
really help. Our goal when using Play is that you should not require other task runners or package management tools for
your JavaScript development [1].

The following things enhance the regular angular-seed project:

1. index.html does not require explicit script statements to load the other js files - we leverage requirejs to do
this for us. This makes the maintenance of files easier by enforcing the
[DRY](http://en.wikipedia.org/wiki/Don't_repeat_yourself) principle.
2. There is a single script statement for loading requirejs from index.html and a data-main attribute declaring the
JavaScript to invoke upon loading it. This declaration is entirely conventional requirejs.
3. Each JavaScript file has an AMD define declaration which declares the AMD modules (these are different to
angular modules - check out (this issue)[https://github.com/angular/angular.js/issues/2078]). Using define() and
require() is conventional for AMD usage.
4. AngularJs is declared as a WebJar - check out the project/Build.scala file to see its declaration. requirejs is also
declared this way so you can easily upgrade its version as new ones become available. By being brought in as a WebJar
you have all of the advantages that artifact repositories including Maven and Ivy based ones bring; in particular
dependency management.

[1] We are not there yet. Play 2.3 plans significant functionality to assist further including linting, unit testing,
optimization and so forth.