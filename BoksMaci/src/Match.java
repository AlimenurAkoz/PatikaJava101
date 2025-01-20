import javax.print.DocFlavor;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (isCheck()){
            System.out.println("===MAÇ BAŞLIYOR===");
            int startingFighter = (int) (Math.random() * 2); // 0 veya 1 döner
            boolean isF1Starting = (startingFighter == 0);
            if (isF1Starting) {
                System.out.println(f1.name + " maça başlayacak!");
            } else {
                System.out.println(f2.name + " maça başlayacak!");
            }

            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("===YENİ ROUND===");
                if (isF1Starting) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                }
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    public boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " KAZANDI!");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " KAZANDI!");
            return true;
        }

        if (this.f1.health == this.f2.health){
            System.out.println("BERABERE");
            return true;
        }
        return false;
    }
}
