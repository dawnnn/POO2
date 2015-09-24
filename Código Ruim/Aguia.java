public class Aguia : IAnimal
{
   public string Nome { get; set; }
 
   public string Reino { get; set; }
 
   public void Correr()
   {
      // águia não corre
      throw new NotImplementedException();
   }
 
   public void Voar()
   {
      // Código para águia voar
   }
 
   public void Nadar()
   {
      // a águia não nada 
      throw new NotImplementedException();
   }
}