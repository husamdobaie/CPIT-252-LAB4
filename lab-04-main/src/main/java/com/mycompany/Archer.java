
package com.mycompany;

public class Archer implements Characters{
    private String name;
    private Avatar avatar;
    
    public Archer(String name){
        if (name == null ) {
            throw new IllegalArgumentException("Character must have a name");
        }
        this.name=name;
        avatar = new Avatar.Builder(SkinTone.DARK).withHairColor(HairColor.BLOND).withHairType(HairType.LONG_STRAIGHT).withBodyType(BodyType.FIT).withFacialFeatures(FacialFeatures.CLEAN_SHAVEN).build();
    }

    @Override
    public String getName() {
        
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
        
    }

    @Override
    public Avatar getAvatar() {
        
        return avatar;
    }

    @Override
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
        
    }
    public String toString(){
        return this.name+" has "+this.avatar.toString(); 
    }
    
}
