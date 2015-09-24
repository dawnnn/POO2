public class Cachorro : IAnimal
{
   public string Nome { get; set; }
 
   public string Reino { get; set; }
 
   public void Correr()
   {
      // o código para o cachorro correr
   }
 
   public void Voar()
   {
      // Cachorro não voa!!!!!
      throw new NotImplementedException();
   }
 
   public void Nadar()
   {
      // o código do "nado cachorrinho
   }
}