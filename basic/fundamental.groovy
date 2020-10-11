task groovy  {}

def noArg() {
    println "no arg func"
}

def oneArg(x) {
    x
}

def twoArgs(x ,y){

}

twoArgs oneArg 500 200 // does not wotk (use oneArg())


//--------------------------------------------------------------------------------------------------
def closure = {
    println "Is closure"
}

closure()

//with closure we can work as simple var

//closure with atgs:
dev closure = {x -> println "Closure with $x"}

//list syntax
def list = ["Groovy", "Gradle"]
def printlnItem = {item -> println "List item: $item"}
list.each(printlnItem)
list.each{println "List item: $it"}