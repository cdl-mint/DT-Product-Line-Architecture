package generic.extensions;

import generic.structure.Executor;
import generic.structure.IStructure;
import generic.structure.Monitor;

public interface IDTExtension {

    public void setMonitor(Monitor m);

    public void setExecutor(Executor e);

    public void execute();

    public void addDependency(IDTExtension ex);

}
