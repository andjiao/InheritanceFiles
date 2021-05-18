
/* keyword extends er den der skaber selve inheritance. Den gør  at klassen Dress,
henter attributer (og evt. metoder) fra klassen Cloth. Hvis flere klassen har samme attributer
kan man bruge inheritance, så  man ikke behøver at skrive attributerne igen og igen i hver klasse*/
public class Dress extends Cloth{

    //Dress-klassen kan have sine egne attributter, som defineres her
    private String dressLength;
    private String occasion;




    //Constructoren skal hedde det samme som klassen, når man har at gøre med inheritance

    /*Da klassen er en udvidelse(med keyword extend) af Cloth-klassen,
    skal parameterne være de samme som fra klassen Cloth og derefter kommer de nye attrubter,
    der specifik gør sig gældende i Dress-klassen*/
    public Dress (String mærke,int size, String dressLength, String occasion) {
        /*super referer til at disse parameter, kommer fra forældre-klassen.
        Når man bruger super, kalder man på forældre-klassen constructor*/
        super(mærke, size);

        // Da de 3 næste er nye attribute, tilhørende Dress-klassen, opstilles de som en normal constructor
        this.dressLength = dressLength;
        this.occasion= occasion;

    }


    //Da attributerne er private, er det nødvendigt med en getter for at kunne bruge attributerne i andre klasser
    public String getDressLength(){
        return this.dressLength;
    }

    public String getOccasion(){
        return this.occasion;
    }

    //Der bruges toString metode, så der i terminalen opgives teksten frem for dataens id
    @Override
    public String toString() {
        return super.toString() + " Kjolelængde:"+ this.dressLength + " Occasion:" + this.occasion;
    }
    //"Dress{" + "dressLength='" + dressLength + '\'' + ", occasion='" + occasion + '\'' + '}';
    }


