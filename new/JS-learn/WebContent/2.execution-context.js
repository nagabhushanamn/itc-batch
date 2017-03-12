/**
 * 
 */

/*
 *  Execution-Context
 *  ------------------
 *  
 *  memory with args & local variables to execute instructions
 *  
 *  phases
 *  
 *  phase-1 : creation
 *  
 *  	==> all the variables declared any-where will get hoisted 
 *          to top with default value 'undefined'
 *  
 *  phase-2 : execution
 *  
 *      ==> instructions execute in sequence
 *      
 *      --------------------------------------------------------
 *      
 *      by default .js runtime has one 'global-context' and 'global-object'
 *      
 *      browser-envi:
 *      
 *      global-object ==> window
 *      
 *      ---------------------------------------------------
 *      
 *      imp-note: every func invocation also creates new-context 
 *                which is child of in which context that func declared.
 * 
 * 
 */

//
//var v=12;
//function f(){
//	console.log(v);
//	var v=13;
//}
//f(); // f-context  ==> global-context


//---------------------------------------------------



var v=12;

function f1(){
	var v=13;
	function f2(){
		console.log(v);
	}
	f2(); // f2-context ==> f1-context
	
}
f1(); //f1-conhtext  ==> global-conhtext





















