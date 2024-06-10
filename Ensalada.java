public class Ensalada{
  String Base, Proteina, Leguminoza, Aderezo, Verdura, Cereal, Topping;
  int opc,opc2;
  public String Tomar_Orden(){

    System.out.println(">Selecciona los ingredientes para tu ensalada, escribe el numero de ingredientes seleccionado: ");
    int Sel_base=0;
    int i=0;
    do{
      Sel_base=Integer.parseInt(System.console().readLine("1.-Lechuga romana \n2.-Lechuga orejona\n>Opcion:"));
      if(Sel_base == 1){
        this.Base="Lechuga Romana"; 
        i=1;
      }
      else if(Sel_base == 2)
      {
        this.Base="Lechuga Orejona";
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      }
      }while(i==0);
    System.out.println("\n>Selecciona la proteina, escribe el numero: ");
    int Sel_Proteina=0;
    i=0;
    do
    {
      Sel_Proteina=Integer.parseInt(System.console().readLine("1.-Pollo\n2.-Huevo\n>Opcion:"));
      if(Sel_Proteina==1)
      {
        this.Proteina="Pollo";
        i=1;
      }
      else if(Sel_Proteina==2)
      {
        this.Proteina="Huevo";
        i=1;
      } 
      else
      {
        System.out.println("Seleccion no valida");
      }   
    }while(i==0);

      int Sel_Leguminoza=0;
      System.out.println("\n>Selecciona la Leguminoza, escribe el numero: ");
    i=0;
      do
      {
        Sel_Leguminoza=Integer.parseInt(System.console().readLine("1.-Tamarindo\n2.-Cacahuate\n>Opcion:"));
        if(Sel_Leguminoza==1)
        {
          this.Leguminoza="Tamarindo";
          i=1;
        }
        else if(Sel_Leguminoza==2)
        {
          this.Leguminoza="Cacahuate";
          i=1;
        }
        else
        {
          System.out.println("Seleccion no valida");
        }
    }while(i==0);

    int Sel_Aderezo=0;
    i=0;
    System.out.println("\n>Selecciona el Aderezo, escribe el numero: ");
    do
    {
      Sel_Aderezo=Integer.parseInt(System.console().readLine("1.-Aderezo ranch\n2.-Aderezo mediterraneo\n>Opcion:"));
      if(Sel_Aderezo==1)
      {
        this.Aderezo="Aderezo ranch";
        i=1;
      }
      else if(Sel_Aderezo==2)
      {
        this.Aderezo="Aderezo mediterraneo";
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      }
    }while(i==0);

    int Sel_Verdura=0;
    System.out.println("\n>Selecciona la Verdura, escribe el numero: ");
    do
    {
      Sel_Verdura=Integer.parseInt(System.console().readLine("1.-Tomate\n2.-Zanahoria\n>Opcion:"));
      if(Sel_Verdura==1)
      {
        this.Verdura="Tomate";
        i=1;
      }
      else if(Sel_Verdura==2)
      {
        this.Verdura="Zanahoria";
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      }
    }while(i==0);

    int Sel_Cereal=0;
    System.out.println("\n>Selecciona el Cereal, escribe el numero: ");
    do
      {
        Sel_Cereal=Integer.parseInt(System.console().readLine("1.-Avena\n2.-Quinua\n>Opcion:"));
        if(Sel_Cereal==1)
        {
          this.Cereal="Avena";
          i=1;
        }
        else if(Sel_Cereal==2)
        {
          this.Cereal="Quinua";
          i=1;
        }
        else
        {
          System.out.println("Seleccion no valida");
        }
      }while(i==0);

    int Sel_Topping=0;
    System.out.println("\n>Selecciona el Topping, escribe el numero: ");
    do
      {
        Sel_Topping=Integer.parseInt(System.console().readLine("1.-Semillas y nueces\n2.-Frutas deshidratadas\n>Opcion:"));
        if(Sel_Topping==1)
        {
          this.Topping="Semillas y nueces";
          i=1;
        }
        else if(Sel_Topping==2)
        {
          this.Topping="Frutas deshidratadas";
          i=1;
        }
        else
        {
          System.out.println("Seleccion no valida");
        }
      
      }while(i==0);
    
    return "\nSe guardo tu orden";
  }
      
  
  public String prepararse()
  {
    int i=0;
    
    System.out.println("\nSe ha puesto la "+this.Base+" de base");
    System.out.println("\nSe puso el "+this.Proteina+" sobre la base");
    do
    {
          this.opc=Integer.parseInt(System.console().readLine("\n>Deseas poner el aderezo revuelto o al lado(escribe 1 para revuelto y 2 para al lado): "));
      if(this.opc==1)
      {
       System.out.println("\nEl aderezo se a puesto revuelto..");
         i=1;
      }
      else if(this.opc==2)
      {
        System.out.println("\nEl aderezo se a puesto a un lado...");
        i=1;
      }
      else
      {
        System.out.println("Seleccion no valida");
      }
    }while(i==0); 

    System.out.println("\nSe agrego la verdura seleccionada("+this.Verdura+")...");

    do
    {
      this.opc2=Integer.parseInt(System.console().readLine("\n>Deseas revolver el cereal o ponerlo encima(1.-Revolver\n2.-Encima)\nElige el numero: "));
      
      if(this.opc2==1)
      {
        System.out.println("\nLa "+this.Cereal+" se revolvio");
          i=1;
      }
      else if(this.opc2==2)
      {
        System.out.println("\nLa "+this.Cereal+" se puso encima");
        i=1;
      }
      else
      {
        System.out.println("Seleccion incorrecta");
      }
    }while(i==0);
    System.out.println("\nSe puso la "+this.Topping+" encima...");

  return "\n~~La ensalada a sido preparada";  
  }//Metodo prepararse
  public void Imprimir_Orden()
  {
    System.out.println("°°°°°ORDEN°°°°°\n>BASE: "+this.Base+"\n>PROTEINA: "+this.Proteina+"\n>LEGUMINOZA: "+this.Leguminoza+"\n>ADEREZO: "+this.Aderezo+"\n>VERDURA: "+this.Verdura+"\n>CEREAL: "+this.Cereal+"\n>TOPPING: "+this.Topping+"\n---------------");
  }
  
}//Clase ensalada
