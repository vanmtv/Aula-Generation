package ExercPOO1610;

	public class TesteAnimal {
		public static void main (String args[])
		{
			Animal cao = new Cachorro();
			cao.setNome("Bethoven");
			cao.setIdade(5);
			cao.setMovimento("corre");
			cao.setSom("late");
			
			
			Animal cavalo = new Cavalo();
			cavalo.setNome("Alasao");
			cavalo.setIdade(15);
			cavalo.setMovimento("corre");
			cavalo.setSom("relincha");
			
			Animal preguica = new Preguica();
			preguica.setNome("Sid");
			preguica.setIdade(50);
			preguica.setMovimento("sobe arvores");
			preguica.setSom("pia");
			
			Animal[] animais = new Animal[3];
			animais[0]=cao;
			animais[1]=cavalo;
			animais[2]=preguica;
			
			for (Animal animal:animais) {
				System.out.println(animal.getNome()+ " " + animal.movimentarAnimal() + " " +animal.emitirSom());
			}

	}
	}

