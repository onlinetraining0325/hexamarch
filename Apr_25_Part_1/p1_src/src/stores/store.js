import { createStore } from "@reduxjs/toolkit";
import CounterReducer from '../reducers/CounterReducer'
const store = createStore(CounterReducer);
export default store;