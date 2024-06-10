class Main {
  public static void main(String[] args) {
    int opc;
    Ensalada chalan=new Ensalada();
    Taco chalan1=new Taco();
    System.out.println("°°°°°MENU°°°°°");
    System.out.println("\n>1.-ENSALADA\n>2.-TACO");
    opc=Integer.parseInt(System.console().readLine("~~Escribe el numero de tu opcion: "));
    if(opc==1)
    {
      chalan.Tomar_Orden();
      chalan.prepararse();
      chalan.Imprimir_Orden();
    }
    else if(opc==2)
    {
      chalan1.Tomar_OrdenTaco();
      chalan1.Prepararse();
      chalan1.Imprimir_Orden();
    }
  }
}