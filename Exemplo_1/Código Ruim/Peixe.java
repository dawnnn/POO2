public class Peixe : IAnimal
{
   public string Nome { get; set; }
 
   public string Reino { get; set; }
 
   public void Correr()
   {
      // peixe não correr
      throw new NotImplementedException();
   }
 
   public void Voar()
   {
      // Peixe não voa!!!!!
      throw new NotImplementedException();
   }
 
   public void Nadar()
   {
      // o código para o peixe nadar
   }
}