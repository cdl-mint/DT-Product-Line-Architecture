#!/bin/bash

# VM arguments
vm_args="--add-opens java.base/java.util=ALL-UNNAMED"

# Model path
input_model_path="model_five_stacks.xmi"


java -jar $vm_args momot_stack.jar $input_model_path

