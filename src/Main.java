 import java.net.SocketOption;
 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Weapon weapon = new Weapon();
         System.out.println("Weapons and types of injuries  1) Sword 2) Spear 3) Axe 4) Magic Stick");

             weapon.setIWeapontype(new Sword());
             weapon.AttackWithWeapon();

             weapon.setIWeapontype(new Spear());
             weapon.AttackWithWeapon();

             weapon.setIWeapontype(new Axe());
             weapon.AttackWithWeapon();

             weapon.setIWeapontype(new MagicStick());
             weapon.AttackWithWeapon();



     }

 }


