class User{

     var name = ""
     var height = 0.0
     var weight = 0.0
     var onDiet = false



     fun calculateBMI(): Double {
          var bmi= (weight* 703.07) /  (height * height)
          return bmi

     }
     fun result(): Char {

          var ch: Char = if(calculateBMI() < 18.5) {
               'U'
          } else if(calculateBMI()<25) {
               'N'
          } else {
               'O'
          }
          return ch
     }
}

