/**
 * 
 */


function teach(sub){
	console.log('teaching '+sub);
	var notes=sub+"-notes";
	
	function learn(){
		console.log('learning '+sub+" with "+notes);
	}
	
	//learn();
	
	console.log('teaching end...');
	return learn;
}

var learnFunc=teach('.js');

learnFunc();
learnFunc();





