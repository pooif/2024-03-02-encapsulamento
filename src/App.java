class App {
  public static void main(String[] args) {
    // Casos de Teste / Assertivas:
    // tudo que a gente espera que seja verdadeiro
    Marcador m1 = 
      new Marcador("Verde", "Faber", 10);
    
    // true: caso de teste passou
    // false: caso de teste falhou
    System.out.println("Verde".equals(m1.getCor())); 
    System.out.println("Faber".equals(m1.getFabricante()));
    System.out.println("Faber".equals(m1.getMarca()));

    System.out.println(10 == m1.getCapacidade());
    System.out.println(10 == m1.getTinta());
    System.out.println(true == m1.isCheio());
    System.out.println(false == m1.isVazio());

    m1.escrever();
    // estado, a cada momento do "tempo"
    System.out.println(10 == m1.getCapacidade());
    System.out.println(9 == m1.getTinta());
    System.out.println(false == m1.isCheio());
    System.out.println(false == m1.isVazio());
    
    while ( ! m1.isVazio()) m1.escrever();
    
    // estado, a cada momento do "tempo"
    System.out.println(10 == m1.getCapacidade());
    System.out.println(0 == m1.getTinta());
    System.out.println(false == m1.isCheio());
    System.out.println(true == m1.isVazio());

  }

}