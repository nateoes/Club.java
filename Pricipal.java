public class Pricipal {
    public static void main(String[] args) {
        Judoka[] judokasmasculinos=new Judoka[5];
        judokasmasculinos[0]=new Judoka("josefdino","buitrago","quespe","10/05/2022","masculino","-90",85);
        judokasmasculinos[1]=new Judoka("max pawer","Esquile","manson","05/06/2021","masculino","+100",115);
        judokasmasculinos[2]=new Judoka("El bicho","Servivon","Loisur","20/09/2022","masculino","-81",78);
        judokasmasculinos[3]=new Judoka("montre","del castillo","Ertren","09/08/2022","masculino","-73",70);
        judokasmasculinos[4]=new Judoka("Melgibson","Choque","Palacios","27/01/2019","masculino","-66",61);

        Judoka[] judokasfemeninos=new Judoka[3];
        judokasfemeninos[0]=new Judoka("josefina","esten","mendez","14/02/2009","Femenino","-52",49);
        judokasfemeninos[1]=new Judoka("maria","marques","mostaño","30/10/2021","Femenino","-63",59);
        judokasfemeninos[2]=new Judoka("Carla","mamonoa","loster","12/05/2020","Femenino","-48",46);

        Club[] club1=new Club[2];
        club1[0]=new Club("Club esqueler",judokasmasculinos,"Collas");
        club1[1]=new Club("Club marcoriamos ",judokasfemeninos,"Cambas ");

        Municipio municipio=new Municipio("Quillacollo",club1);

        System.out.println();
        //System.out.println(municipio);
        for(int i=0;i<judokasmasculinos.length;i++){
            System.out.println(judokasmasculinos[i].getNombre());
            if(judokasfemeninos.length>i){
                System.out.println(judokasfemeninos[i].getNombre());
            }
        }

        String[] nom=new String[8];
        nom[0]= municipio.club[0].plantilla[1].getNombre();
        System.out.println("xd");
        System.out.println(nom[0]);
        /*
        inscritos[1]=new Judoka("max pawer","Esquile","manson","05/06/2021","masculino","+100",115);
        inscritos[2]=new Judoka("El bicho","Servivon","Loisur","20/09/2022","masculino","-81",78);
        inscritos[3]=new Judoka("montre","del castillo","Ertren","09/08/2022","masculino","-73",70);
        inscritos[4]=new Judoka("Melgibson","Choque","Palacios","27/01/2019","masculino","-66",61);
        inscritos[5]=new Judoka("josefina","esten","mendez","14/02/2009","Femenino","-52",49);
        inscritos[6]=new Judoka("maria","marques","mostaño","30/10/2021","Femenino","-63",59);
        inscritos[7]=new Judoka("Carla","mamonoa","loster","12/05/2020","Femenino","-48",46);
*/
    }
}
