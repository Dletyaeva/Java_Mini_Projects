class Droid{
    int BatteryLevel;
    String DroidName;
    String task;
    //constructor
        Droid(int BatteryLevel, String DroidName){
            this.BatteryLevel = BatteryLevel;
            this.DroidName = DroidName;
        }
        void performTask(String task){
        System.out.println(this.DroidName + " performed " + task);
        this.BatteryLevel -= 10;
    }
    void toString(String DroidName){
        System.out.println("Hi, I'm the droid called " + DroidName);
    }
    int getBatteryLevel(){
        return this.BatteryLevel;
    }
    void energyReport(){
        System.out.println(this.DroidName + "'s Battery is at " + this.BatteryLevel);
    }
    String getName(){
        return this.DroidName;
    }
    void setBatteryLevel(Droid DroidName, int amount){
        DroidName.BatteryLevel -= amount;
    }
    void energyTransfer(Droid Reciever){
        setBatteryLevel(Reciever , -90);
        setBatteryLevel(this, 90);
    }
}