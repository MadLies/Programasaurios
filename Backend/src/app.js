import express from 'express';
import tasksRouters from './routers/task'


const app = express();
app.use(tasksRouters)

export default app;