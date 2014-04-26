dropwizard-quickstart
=====================

Hello world application for Dropwizard - for an even quicker start of a new Dropwizard project.

A very slightly amended version of the instructions on the Dropwizard Getting Started page here: https://dropwizard.github.io/dropwizard/getting-started.html

Has one endpoint, "example", that will report back the value of a message param passed in, along with a generated id.

To get it up and running in Eclipse, for example:
1) Create a new run configuration for a Java Application
2) Set the project as dropwizard-quickstart
3) Set the Main class as com.github.sjwells.dropwizardquickstart.DropwizardQuickstartApplication
4) In the arguments tab specify: server dropwizard-quickstart.yaml
5) Click Run

Then hit:
http://localhost:8080/example?message=HelloWorld

You should see the following Json response:

{
"message": "HelloWorld",
"id": 1
}