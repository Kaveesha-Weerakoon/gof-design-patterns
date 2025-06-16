package AbstactFactory;

public class MSIFactory implements ProductAbstractFactory{
    public GPU createGPU(){
        return new MSIGPU();
    }

    public CPU createCPU(){
        return new MSISCPU();
    }

}
