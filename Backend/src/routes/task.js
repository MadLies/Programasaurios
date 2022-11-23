import { Router } from 'express';
import { deleteTask, getTask, getTaskCount, getTasks, saveteTask, updateTask } from '../controllers/task';

const router = Router()

router.get('/tasks', getTasks)

router.get('/tasks/count', getTaskCount)

router.get('/tasks/:id',getTask )

router.post('/task', saveteTask)

router.delete('/tasks/:id', deleteTask)

router.put('/tasks/:id', updateTask)

export default router

