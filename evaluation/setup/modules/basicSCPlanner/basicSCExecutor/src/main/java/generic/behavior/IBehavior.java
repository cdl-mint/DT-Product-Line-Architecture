package generic.behavior;

import generic.structure.IStructure;

public interface IBehavior {

    IStructure.Operation compute(IStructure currentStructure);
}
