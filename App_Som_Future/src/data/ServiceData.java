package data;

public class ServiceData {

    //Attributes
    Service[] services;
    //Builder
    public ServiceData() {
        FillData();
        services = new Service[10];
    }
    //Methods
    public void FillData() {
        services[0] = new Service("Limpieza", "Mayka A.T", "Limpiezas Mayka A.T. Matar� es el resultado de m�s de 20 a�os de experiencia en el sector, con una larga trayectoria profesional cuyos comienzos nos han llevado a ampliar nuestros objetivos para ofrecer un mejor servicio a nuestros clientes.\r\n" + 
                "Nuestra finalidad y principales objetivos est�n basados en la Calidad y Servicio, conceptos que sin duda, sin ellos no podr�amos alcanzar la meta para nuestra Empresa.\r\n" + 
                " ", " ", 10.0);
        services[1] = new Service("Comida", "MENUDIET", "Elige entre comprar un Men� semanal para recibir las comidas y/o cenas de la semana (para 5 o 7 d�as) organizadas para cuidar tu salud o selecciona Platos a la cartapara comprar tus platos favoritos a la carta y consumirlos a tu ritmo; Tambi�n puedes empezar con un Men� Degustaci�n y probar 4 platos para comprobar la calidad de nuestra comida.", " ", 10.0);
        services[2] = new Service("Lavander�a", "Ecolaundry", "Est� formado por una red de centros inteligentes de lavado que, mediante el uso de maquinaria industrial de alta calidad, ofrece al usuario, un servicio de lavado y secado econ�mico y respetuoso con el medio ambiente.", " ", 10.0);
        services[3] = new Service("Transporte", "Som mobilitat", "Somos una cooperativa de consumo sin animo de lucro que trabaja para una movilidad m�s sostenible. Ofrecemos servicios para compartir veh�culos el�ctricos entre los vecinos, entidades, empresas i administraciones de toda Catalunya.", " ", 10.0);
    }
}


