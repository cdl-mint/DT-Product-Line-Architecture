# Evaluation

This folder contains the models created during the evaluation presented in the paper. The folder `setup` contains all template, module, and reference architecture definitions that are described in the evaluation setup. The remaining subfolders contain the data for the respective scenarios, as described below.

## Scenario 1: Building DT architecture variants
In a typical situation, our partner’s clients already use certain DT services and platforms. As a result,
our industry partner is forced to tailor a wide range of DT architectures that use customized tool combinations to satisfy the different customers’ needs. Whereas some of these DT architectures implement the same functionality and also share the same reference architecture (Scenario 1.A), others implement different applications, but still share architectural similarities (Scenario 1.B). The manual configuration of all these DT architectures is evidently tedious and error-prone, as it involves a lot of redundant work.
The folder `scenario_1` contains the configuration for the product line `setup/RADs/MAPE.pl` that is derived from the reference architecture `setup/RADs/MAPE.arc`. 

## Scenario 2: Evolving existing DT architectures
Over time, most organizations iteratively extend the set of DT services they use. 
For instance, clients might ask to add a new time-based deviation checker to replace the default event-based one, or raise the need for a new DT platform (e.g. Eclipse [Ditto](https://www.eclipse.org/ditto/).
Extending DT architecture functionality of existing templates with new module implementations (Scenario 2.A) requires the adaptation of existing DT architectures using this new implementation.
In a manual setting, this usually involves significant integration effort, as the new tool has to be connected to each DT architecture configuration, while making sure that both, the software interfaces match, and the individual tool languages are made compatible. Clearly, this effort grows exponentially as the number of services and tools grows.
Over time, continuous innovation also leads to the development of new DT-related functionality. Introducing such new functionality into existing DT architectures (Scenario 2.B) adds another level of complexity to the integration process, as this communication with existing functionality needs to be defined for all different configuration options.
The folder `scenario_2` contains two subfulders (i.e. `scenario_2_a` and `scenario_2_b`) that contain the additional module or reference architecture definition as well as the adapted architecture models required to perform the evolutions from the architectures in scenario 1, as described in the paper.

