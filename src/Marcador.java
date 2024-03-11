class Marcador {
  // encapsulamento
  private final String cor;
  private final String fabricante;
  private final int capacidade;

  private int tinta;

  Marcador(String paramCor,
           String paramFabricante,
           int paramCapacidade) {
    cor = paramCor;
    fabricante = paramFabricante;
    capacidade = paramCapacidade;
    tinta = capacidade;
  }
  // método que leem o objeto e devolvem o estado:
  // métodos consulta / query
  // acessores // accessors methods
  String getCor() { // pegaCor, leCor, lerCor
    return cor;
  }

  int getCapacidade() {
    return capacidade;
  }

  String getFabricante() {
    return fabricante;
  }

  // annotation (anotação, @algo)
  @Deprecated // obsoleto
  String getMarca() { // alias
    return fabricante;
  }

  int getTinta() {
    return tinta;
  }

  boolean isVazio() { // consulta, pergunta
    return tinta == 0;
  }

  boolean isCheio() {
    return tinta == capacidade;
  }

  void escrever() {
    if (tinta > 0) tinta--;
  }
}
