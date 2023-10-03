public class Weapon {
    private IWeapontype IWeapontype;

    public void setIWeapontype(IWeapontype IWeapontype) {
        this.IWeapontype = IWeapontype;
    }
    public void AttackWithWeapon(){
        IWeapontype.doAction();
    }
}
