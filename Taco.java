public class Taco{
   String tortilla, carne, verdura, salsa, queso, complementos, cantortillas;
  
  public String Tomar_OrdenTaco(){
    System.out.println("Selecciona los ingredientes de tu taco: ");
    int opc_tortilla=0;
    int i=0;
    do{
    opc_tortilla=Integer.parseInt(System.console().readLine("1.-Tortilla de maiz\n2.-Tortilla de harina\n>Escribe el numero de tu opcion: "));
      if(opc_tortilla==1)
      {
        this.tortilla="Tortilla de maiz";
        i=1;
      }
      else if(opc_tortilla==2)
      {
        this.tortilla="Tortilla de harina";
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      } 
    }while(i==0);


    System.out.println("Selecciona la carne del taco:");
    int opc_carne=0;
    i=0;
    do
    {
        opc_carne=Integer.parseInt(System.console().readLine("1.-Carne de cerdo\n2.-Carne de res, escribe el numero: "));
      if(opc_carne==1)
      {
        this.carne="Carne de cerdo";
        i=1;
      }
      else if(opc_carne==2)
      {
        this.carne="Carne de res";
        i=1;
      } 
      else
      {
        System.out.println("Seleccion no valida");
      }
    }while(i==0);

    System.out.println("Selecciona la verdura del taco:");
    int opc_verdura=0;
    i=0;
    do
    {
      opc_verdura=Integer.parseInt(System.console().readLine("1.-Cebolla\n2.-Cilantro\n3.-Cebolla y cilantro\nEscribe el numero: "));
      if(opc_verdura==1)
      {
        this.verdura="cebolla";
        i=1;
      }
      else if(opc_verdura==2)
      {
        this.verdura="cilantro";
        i=1;
      }
      else if(opc_verdura==3)
      {
        this.verdura="cebolla y cilantro";
        i=1;
      }  
      else
      {
        System.out.println("Seleccion no valida");
      }
    }while(i==0);

    
    System.out.println("Selecciona la salsa del taco:");
    int opc_salsa=0;
    i=0;
    do
    {
      opc_salsa=Integer.parseInt(System.console().readLine("1.-Salsa verde\n2.-Salsa roja\nEscribe el numero: "));
      if(opc_salsa==1)
      {
        this.salsa="salsa verde";
        i=1;
      }
      else if(opc_salsa==2)
      {
        this.salsa="salsa roja";
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      }
    }while(i==0);


    System.out.println("Selecciona el queso del taco:");
    int opc_queso=0;
    i=0;
    do
    {
      opc_queso=Integer.parseInt(System.console().readLine("1.-Queso manchego\n2.-Queso cheddar\nEscribe el numero: "));
      if(opc_queso==1)
      {
        this.queso="queso manchego";
        i=1;
      }
      else if(opc_queso==2)
      {
        this.queso="queso cheddar";
        i=1;
      }
      else
      {
      System.out.println("Seleccion no valida");
      }
    }while(i==0);

    System.out.println("Selecciona el complemento");
    int opc_complemento=0;
    i=0;
    do
    {
opc_complemento=Integer.parseInt(System.console().readLine("\n1.-Piña\n2.-Nopales\nEscribe el numero de tu opcion: "));
      if(opc_complemento==1)
      {
        this.complementos="cebolla";
        i=1;
      }
      else if(opc_complemento==2)
      {
        this.complementos="nopales";
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      }
    }while(i==0);

    System.out.println("Selecciona la cantidad de tortillas: ");
    int opc_cantortilla=0;
    i=0;
    do
    {
      opc_cantortilla=Integer.parseInt(System.console().readLine("1.-Doble tortilla\n2.-Una tortilla\nEscribe el numero de la opcion:"));

      if(opc_cantortilla==1)
      {
        this.cantortillas="Doble tortilla";
        i=1;
      }
      else if(opc_cantortilla==2)
      {
        this.cantortillas="Una tortilla";
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      }
    
    }while(i==0);

    return "Se guardo tu orden";
  }//Tomar orden
  
  public String Prepararse()
  {
    System.out.println("Se puso "+this.cantortillas+" de "+this.tortilla);

    System.out.println("Se puso la "+this.carne);
    System.out.println("Se puso encima "+this.verdura);
    System.out.println("Se puso encima "+this.salsa);
    System.out.println("Se puso encima el "+this.queso);
    System.out.println("Se puso "+this.complementos);

    return "Su taco a sido preparado";
  }//prepararse
  public void Imprimir_Orden()
  {
    System.out.println("°°°°°ORDEN°°°°°\n>TORTILLA: "+this.tortilla+"\n>CARNE: "+this.carne+"\n>VERDURA: "+this.verdura+"\n>SALSA: "+this.salsa+"\n>QUESO: "+this.queso+"\n>COMPLEMENTO: "+this.complementos+"\n>cANTIDAD DE TORTILLA: "+this.cantortillas+"\n---------------");
    
  }//imprimir 
}