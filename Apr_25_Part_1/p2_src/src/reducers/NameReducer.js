const initialState = {
    sname : ''
}

const NameReducer = (state = initialState, action) => {
    switch(action.type) {
        case 'SAM' :
            return {...state, sname:'Hi I am Sam Arin...'};
        case 'KIRUPA' :
            return {...state, sname:'Hi I am Kirupa...'};
        case 'SAJEETHA' :
            return {...state, sname:'Hi I am Sajeetha...'};
        default : 
            return state;
    }
}

export default NameReducer;