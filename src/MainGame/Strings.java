package MainGame;

// Esta clase simplemente sirve para almacenar los strings que lo hace en un array a traves del cual podemos acceder luego desde la clase principal.

public class Strings {

    // Array con todos los textos del juego
    public static final String[] TEXTS = {
            """
         \n
        ███████ ████████  █████  ██████      ██     ██  █████  ██████  ███████      ██████ ██████  ██  ██████   ██████  ███████     ███████ ███████  ██████ ██████  ███████ ████████  ██████  ███████\s
        ██         ██    ██   ██ ██   ██     ██     ██ ██   ██ ██   ██ ██          ██      ██   ██ ██ ██       ██    ██ ██          ██      ██      ██      ██   ██ ██         ██    ██    ██ ██     \s
        ███████    ██    ███████ ██████      ██  █  ██ ███████ ██████  ███████     ██      ██   ██ ██ ██   ███ ██    ██ ███████     ███████ █████   ██      ██████  █████      ██    ██    ██ ███████\s
             ██    ██    ██   ██ ██   ██     ██ ███ ██ ██   ██ ██   ██      ██     ██      ██   ██ ██ ██    ██ ██    ██      ██          ██ ██      ██      ██   ██ ██         ██    ██    ██      ██\s
        ███████    ██    ██   ██ ██   ██      ███ ███  ██   ██ ██   ██ ███████      ██████ ██████  ██  ██████   ██████  ███████     ███████ ███████  ██████ ██   ██ ███████    ██     ██████  ███████\s
         \n
        Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa
        Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan
        en una nave imperial robada en una misión secreta para infiltrarse
        en otra estrella de la muerte que el imperio está construyendo para
        destruirla.
        
        (Presiona Intro para continuar)
        """,

            """
        \n
        ███    ██ ██ ██    ██ ███████ ██           ██\s
        ████   ██ ██ ██    ██ ██      ██          ███\s
        ██ ██  ██ ██ ██    ██ █████   ██           ██\s
        ██  ██ ██ ██  ██  ██  ██      ██           ██\s
        ██   ████ ██   ████   ███████ ███████      ██\s
        \n
        Los problemas empiezan cuando deben realizar un salto hiperespecial
        hasta el sistema %d en el sector %d, pero el sistema de navegación
        está estropeado y el computador tiene problemas para calcular parte
        de las coordenadas de salto. Chewbacca, piloto experto, se da cuenta
        que falta el cuarto número de la serie. Recuerda de sus tiempos en la
        academia de pilotos que para calcularlo hay que calcular el sumatorio
        entre el nº del sistema y el nº del sector (ambos inclusive).
        
        ¿Qué debe introducir?
        """,
        """
        \n
        ███    ██ ██ ██    ██ ███████ ██          ██████ \s
        ████   ██ ██ ██    ██ ██      ██               ██\s
        ██ ██  ██ ██ ██    ██ █████   ██           █████ \s
        ██  ██ ██ ██  ██  ██  ██      ██          ██     \s
        ██   ████ ██   ████   ███████ ███████     ███████\s
        \n
        Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo
        lejos la estrella de la muerte. Como van en una nave imperial robada
        se aproximan lentamente con la intención de pasar desapercibidos.
        De repente suena el comunicador. “Aquí agente de espaciopuerto
        %d contactando con nave imperial %d. No están destinados en este
        sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e
        improvisa. “Eh… tenemos un fallo en el… eh… condensador de
        fluzo... Solicitamos permiso para atracar y reparar la nave”. El
        agente, que no se anda con tonterías, responde “Proporcione código
        de acceso o abriremos fuego”. Han Solo ojea rápidamente el manual
        del piloto que estaba en la guantera y da con la página correcta. El
        código es el productorio entre el nº del agente y el nº de la nave
        (ambos inclusive).
        ¿Cuál es el código?.
        """,
        """
       \n
       ███    ██ ██ ██    ██ ███████ ██          ██████ \s
       ████   ██ ██ ██    ██ ██      ██               ██\s
       ██ ██  ██ ██ ██    ██ █████   ██           █████ \s
       ██  ██ ██ ██  ██  ██  ██      ██               ██\s
       ██   ████ ██   ████   ███████ ███████     ██████ \s
       \n       
       Han Solo proporciona el código correcto. Atracan en la estrella de la
       muerte, se equipan con trajes de soldados imperiales que
       encuentran en la nave para pasar desapercibidos y bajan. Ahora
       deben averiguar en qué nivel de los %d existentes se encuentra el
       reactor principal. Se dirigen al primer panel computerizado que
       encuentran y la Princesa Leia intenta acceder a los planos de la
       nave pero necesita introducir una clave de acceso. Entonces 8
       recuerda la información que le proporcionó Lando Calrissian “La
       clave de acceso a los planos de la nave es el factorial de %d/10
       (redondeando %d hacia abajo), donde %d es el nº de niveles”.
       ¿Cuál es el nivel correcto?
       """,
        """

        ███    ██ ██ ██    ██ ███████ ██          ██   ██\s
        ████   ██ ██ ██    ██ ██      ██          ██   ██\s
        ██ ██  ██ ██ ██    ██ █████   ██          ███████\s
        ██  ██ ██ ██  ██  ██  ██      ██               ██\s
        ██   ████ ██   ████   ███████ ███████          ██\s
        
        Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran
        la puerta acorazada que da al reactor principal. R2D2 se conecta al
        panel de acceso para intentar hackear el sistema y abrir la puerta.
        Para desencriptar la clave, necesita verificar si el número %d es primo
        o no. Si es primo introduce un 1, si no lo es introduce un 0.
        """,
        """
        
        ███    ██ ██ ██    ██ ███████ ██          ███████\s
        ████   ██ ██ ██    ██ ██      ██          ██     \s
        ██ ██  ██ ██ ██    ██ █████   ██          ███████\s
        ██  ██ ██ ██  ██  ██  ██      ██               ██\s
        ██   ████ ██   ████   ███████ ███████     ███████\s
        
        Consiguen entrar al reactor. Ya solo queda que Luke Skywalker
        coloque la bomba, programe el temporizador y salir de allí corriendo.
        Necesita programarlo para que explote en exactamente %d minutos y
        %d segundos, el tiempo suficiente para escapar antes de que explote
        pero sin que el sistema de seguridad anti-explosivos detecte y
        desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano
        un tanto peculiar. Para convertir los minutos y segundos al sistema
        Zordgiano hay que sumar el factorial de M y el factorial de S.
        ¿Qué valor debe introducir?
        """,
        """

        ███████ ██ ███    ██\s
        ██      ██ ████   ██\s
        █████   ██ ██ ██  ██\s
        ██      ██ ██  ██ ██\s
        ██      ██ ██   ████\s

        \nLuke Skywalker introduce el tiempo correcto, activa el temporizador
        y empiezan a sonar las alarmas. Salen de allí corriendo, no hay
        tiempo que perder. La nave se convierte en un hervidero de
        soldados de arriba a abajo y entre el caos que les rodea consiguen
        llegar a la nave y salir de allí a toda prisa. A medida que se alejan
        observan por la ventana la imagen de la colosal estrella de la muerte
        explotando en el silencio del espacio, desapareciendo para siempre
        junto a los restos del malvado imperio.
        ¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!
        Enhorabuena ;D
        """
    };

    public static void main(String[] args) {
        System.out.println("Strings cargados correctamente...");
    }
}
