package utilidades;

import java.io.*;

public class MiObjectOutputStream extends ObjectOutputStream {

   
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out); //Llama al constructor de la superclase(OutputStream)
    }

    
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super(); //Llama al constructor de la superclase(OutputStream)
    }

    
    protected void writeStreamHeader() throws IOException {
        //No hacemos nada
    }
}
