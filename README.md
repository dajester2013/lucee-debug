Lucee Debug Webapp
===

This is an Eclipse project intended get you started with a debug environment for hacking on the Lucee 5 source code.  Most of the environment is ready to go, however there are some additional steps you will need to take in order for you to begin debugging.

Setup
---

This guide is written with Eclipse 4.5.1 Mars in mind, but should be applicable to older versions.

**Prerequisites:**

* M2Eclipse
* One of the following:
  * WST + Tomcat Server Adapter, or
  * [Eclipse Jetty Feature](https://marketplace.eclipse.org/content/eclipse-jetty)

**Step 1:  Import the Lucee 5 projects into your workspace**

* If you have not done so yet, pull the Lucee 5 source code from GitHub: http://github.com/lucee/Lucee.git
* Import the `loader` and `core` projects into your workspace

**Step 2: Configure lucee-debug to use the current Maven version of Lucee**

In order to load the dependency libraries properly, you must configure this project's pom.xml to use the specific version of Lucee that you have checked out into your workspace.

* Open the `pom.xml` file in the `loader` project.  Find the version number for the project and copy it.
* Open the `pom.xml` in the `lucee-debug` project and paste the lucee version number into the `lucee.project.version` property

### Jetty instructions:

Jetty is extremely simple to get started, however, it dumps all the config into your project.  To combat this, I've included .gitignore entries to keep all the extra junk from being accidentally committed.

 * **Step 3:**
   * Right-click on the project, and select *Debug As > Run with Jetty*
   
### Tomcat instructions:

Tomcat is a bit more setup, but it deploys your code outside the project folder for runtime, and auto-syncs the files, keeping your project a bit cleaner.

* **Step 3a:  Add Lucee 5 projects to debug project's Deployment Assembly:**
  * Right click on the lucee-debug project in the Project Explorer, and select *Properties*.
  * Select *Deployment Assembly* from the navigation on the properties dialog.
  * Click the *Add* button, and select *Project* from the list.  Click *Next*
  * Select `core` project from the list - the core and loader projects must remain open in order to run the debug app
  
* **Step 3b:**
  * Right-click on the `lucee-debug` project and click *Debug As > Run on Server*
  * Select your configured Tomcat instance, and click *Finish*.  Tomcat should start.  You can skip down to step 4.
  
To infinity and beyond
---

Congrats! You are now able to begin hacking on the Lucee runtime code!  Changes in either the `loader` or `core` projects should be hot-swapped in, although Eclipse will let you know if you need to restart the servlet container.  You can also set breakpoints and do stop-debugging within Eclipse on the loader or core projects.
