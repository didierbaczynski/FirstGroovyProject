/**
 * Created by didierbaczynski on 15-07-20.
 */
class HelloWorld {
    def sayHello(name) {
        println("hello $name !")
    }

    static def main(args){
        HelloWorld hello = new HelloWorld()
        def name = 'Bad'
        hello.sayHello(name)
    }
}
