import {createSelector, createStore} from '@reduxjs/toolkit'

import NameReducer from '../reducers/NameReducer'

const Store = createStore(NameReducer)

export default Store;