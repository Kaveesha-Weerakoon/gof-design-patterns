package AbstactFactory;

public class ASUSFactory implements ProductAbstractFactory{
    public GPU createGPU(){
        return new ASUSGPU();
    }

    public CPU createCPU(){
        return new ASUSCPU();
    }

}
