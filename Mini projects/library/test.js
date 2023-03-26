let myString = "today i don't want to go to school";

let wordArr = myString.split(" ");

let capitaliZed_words = [];

wordArr.forEach((e) => {
  e = e.charAt(0).toUpperCase() + e.slice(1);
  capitaliZed_words.push(e);
});

let capitaliZed_String = capitaliZed_words.toString().replaceAll(",", " ");

console.log(capitaliZed_String);
