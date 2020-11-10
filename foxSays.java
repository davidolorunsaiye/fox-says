import java.util.*;
public class foxSays
{
//@author David Olorunsaiye
    public static void main(String [] args)
    {
        // Initialize all sounds as a string
        String allSounds = "toot woof wa ow ow ow pa blub blub pa toot pa blub pa pa ow pow toot toot woof wa " +
        "ow ow ow pa blub blub pa toot pa blub pa pa ow pow toot toot woof wa ow ow ow pa blub blub pa toot " +
        "pa blub pa pa ow pow toot toot da wa ow rn ow blub blub it wa toot ow blub man pa ow pow toot toot " +
        "woof wa ow ow ow pa blub blub pa toot pa blub pa pa ow pow toot toot woof wa ow ow ow pa blub blub " +
        "pa toot pa blub pa pa ow pow toot toot woof wa ow ow ow ov blub blub va toot ti blub ka ti ow pow " +
        "toot ma pow ti the ow ow wa blub be toot woof ow wa st wa woof ide wa blub blub woof wa as co wa wa " + 
        "toot me as jo wa woof wa ow kes ma ow toot ke yo wa toot wa ur thin toot woof wa wa ow wa ow king as " + 
        "woof wa wa woof fu woof woof wa wa ow wa nny as po ow wa ow ssi woof toot ble da toot woof vid ogi wa wa ow lvy";
        
        // These are the sounds we know aren't made by the fox
        String notFox[] = {"woof", "blub", "toot", "ow", "wa", "sleep", "nuts", "hack", "eat"};

        //Use this method to remove all sounds not made by the fox from the string input
        removeOtherSounds(allSounds, notFox);
       
    }

    public static void removeOtherSounds(String sounds, String [] notFox)
    {
        // Save all sounds made by the animals to an ArrayList
        ArrayList <String> animalSounds = new ArrayList<String>();

        //Separate the list by blank spaces
        animalSounds.addAll(Arrays.asList(sounds.split(" ")));

        //Save the sounds we know arent made by the Fox to an ArrayList which we then convert to a List
        ArrayList <String> notFoxSounds = new ArrayList<String>();
        notFoxSounds.addAll(Arrays.asList(notFox));

        // Remove all the sounds not made by the fox from the list of all sounds
        animalSounds.removeAll(notFoxSounds);

        // What we are left with should be the sound made by the fox
        System.out.print("The fox says: " + animalSounds.toString());
    }
}
