javac --module -path ../abccorp.calculator/out -d out $(find . -name "*.java")$
java --module-path abccorp.calculator/out:xyzcorp.main-app/out --module com.xyzcorp/com.xyzcorp.Runner$
java --module-path abccorp.calculator/out:xyzcorp.main-app/out --module xyzcorp.main-app/com.xyzcorp.Runner$
java --module-path abccorp.calculator/out:xyzcorp.main-app/out --module xyzcorp.mainapp/com.xyzcorp.Runner$
java --module-path abccorp.calculator/out:xyzcorp.main-app/out --list-modules$
java --module-path ../defcorp.service-api/out:../abccorp.calculator/out:../ghicorp.service-impl/out:out --module xyzcorp.mainapp/com.xyzcorp.Runner
