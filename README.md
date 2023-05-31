# Template-based Digital Twin Architecture Modeling
This repository contains the evaluation details of our publication entitled "Template-based Digital Twin Architecture Modeling", which is currently under review for the International Conference on Conceptual Modeling (ER).
In the folder [implementation](./implementation), we provide the maven projects for the implementation of the proposed method which we used for our evaluation.
The folder [evaluation](./evaluation) contains the models required for the performed evaluation.

## Requirements
- Java 8 JDK
- Maven 3.8 or higher

## How to build
- Execute `mvn clean install` in the respective project folder with a pom.xml 
- Since some projects depend on the `templates` project, please build these projects before building the modules.

## Structure
This project contains three subfolders on the root level. 
- The `implementation` folder contains all implementation artifacts of our `framework` and examples of `templates` and `modules` from our concept and evaluation sections. 
- The `scenario_1` folder contains all artifacts of the evaluation scenario 1. Referenced modules and templates can be found in the implementation folder.
- The `scenario_2` folder contains all artifacts of the evaluation scenario 2. Referenced modules and templates can be found in the implementation folder.

```
├── implementation
│   ├── framework
│   │   ├── dt-architecture-lang
│   │   ├── dt-module-lang
│   │   ├── dt-template-lang
│   │   ├── product-line-config-lang
│   │   ├── product-line-lang
│   ├── modules
│   │   ├── aws-tm
│   │   ├── azure
│   │   ├── ...
│   ├── templates
│   │   ├── dt-platform
│   │   ├── planner
│   │   ├── ...
├── scenario_1
│   ├── scenario_1_a
│   ├── scenario_1_b
├── scenario_2
│   ├── scenario_2_a
│   ├── scenario_2_b

```
